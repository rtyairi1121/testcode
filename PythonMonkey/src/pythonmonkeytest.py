'''
Created on 2013/05/08

@author: EXASADMIN01
'''

#!/usr/bin/python
# coding: UTF-8

from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice
import datetime

def getDate():
    d = datetime.datetime.today()
    return d.strftime('%Y%m%d_%H%M%S')


def snapshot(device):
    MonkeyRunner.sleep(1)
    result = device.takeSnapshot()
    result.writeToFile('snapshot/%s.png' % getDate(), 'png')


def init():
    device = MonkeyRunner.waitForConnection()
    device.startActivity(component='jp.probsc.simplecalc2/.MainActivity')
    return device


def printMsg(msg):





def doTest():
    device = init()

    snapshot(device)

    for i in range(1, 1001):
        printMsg('cnt: %d' % i)


        MonkeyRunner.sleep(1)
        device.touch(195, 436, 'DOWN_AND_UP')
        device.type('%d' % i)


        MonkeyRunner.sleep(1)
        device.touch(553, 436, 'DOWN_AND_UP')
        num = i * 2
        device.type('%d' % num)


        MonkeyRunner.sleep(1)
        device.touch(367, 216, 'DOWN_AND_UP')

        snapshot(device)


printMsg('test start.')
doTest()
printMsg('test end.')
