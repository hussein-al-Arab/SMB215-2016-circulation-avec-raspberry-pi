import RPi.GPIO as GPIO
import time

#TRIG = 10
#ECHO = 8
#distance=0

GPIO.setwarnings(False)
GPIO.setmode(GPIO.BOARD)
GPIO.setup(10, GPIO.OUT)
GPIO.setup(8, GPIO.IN)
   
while True:
    GPIO.output(10, False)
    #print "Waitng For Sensor To Settle"
    time.sleep(1)
    GPIO.output(10, True)
    time.sleep(1)
    GPIO.output(10, False)

    while GPIO.input(8)==0:
        signalOff=time.time()
       # print "Waitng For Sensor 0"

    while GPIO.input(8)==1:
        signalOn=time.time()
        #print "Waitng For Sensor  1"

    timePassed=signalOn-signalOff
    distance=timePassed*171.50
    distance=round(distance,2)
    distance= 100*distance+1
    if (distance<20):      #Check whether the distance is within range
       print distance,"cm"      #Print distance with 0.5 cm calibration
    else:
         print "Out Of Range"                   #display out of range
    time.sleep(0.0)
    f=open("/home/pi/Downloads/RaspberryPi.zip","w")
    f.write("AAAAAAAAAAAA: %s\n" %distance)
    #print distance
    f.close()

    
#f.close()
GPIO.cleanup()

    

