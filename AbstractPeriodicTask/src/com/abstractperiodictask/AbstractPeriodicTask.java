package com.abstractperiodictask;

import java.util.Timer;
import java.util.TimerTask;

import android.os.Handler;

public abstract class AbstractPeriodicTask {

    private long period;
    private boolean isDaemon;
    private boolean isCancelled = true;
    private Timer timer;
    private TimerTask timerTask;
    private Handler handler;

    /**
     * period�~���b�̎����œ�����
     * @param period �����~���b
     * @param isDaemon ����������s���X���b�h���f�[�����X���b�h�ō쐬���邩�ǂ����ifalse=���[�U�[�X���b�h�j
     */
    public AbstractPeriodicTask(long period, boolean isDaemon) {
        handler = new Handler();
        this.period = period;
        this.isDaemon = isDaemon;
    }

    /**
     * period�~���b�̎����œ������B�^�C�}�[�X���b�h�̓��[�U�[�X���b�h�ō쐬�����
     * @param period �����~���b
     */
    public AbstractPeriodicTask(long period){
        this(period,false);
    }

    /**
     * �����^�X�N�̎��s���J�n����
     */
    public void execute(){

        if(!isCancelled){
            //isCancelled��false�i=���s���j�Ȃ�΂��̃��\�b�h�͎��s���Ȃ�
            return;
        }

        //timer���L�����Z�������ꍇ�Atimer,timerTask�͔j�������̂œs�x��蒼��
        timerTask = new TimerTask(){
            @Override
            public void run() {
                preInvokersMethod();
                handler.post(new Runnable(){
                    @Override
                    public void run() {
                        invokersMethod();
                    }
                });
                postInvokersMethod();
            }
        };
        timer = new Timer(isDaemon);
        timer.scheduleAtFixedRate(timerTask, period, period);

    }

    /**
     * �����^�X�N�̎��s���L�����Z������
     */
    public void cancel(){
        if(timer==null || timerTask==null){
            return;
        }
        timer.cancel();
        timer = null;
        isCancelled = true;
    }

    /**
     * �{�C���X�^���X���쐬�����X���b�h(�Ⴆ��UI�X���b�h�j�ŏ��������郁�\�b�h
     */
    abstract protected void invokersMethod();

    /**
     * �^�C�}�[�X���b�h�ŏ��������郁�\�b�h��invokersMethod�̒��O�ɌĂ΂��B
     */
    protected void preInvokersMethod(){
    }

    /**
     * �^�C�}�[�X���b�h�ŏ��������郁�\�b�h��invokersMethod�̒���ɌĂ΂��B
     */
    protected void postInvokersMethod(){
    }

}