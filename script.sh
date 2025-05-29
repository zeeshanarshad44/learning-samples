#!/bin/bash

#default name
name="zeeshan"

user=$(whoami)
date=$(date)
whereami=$(pwd)

#echo "What is your name?"
#read  prname

echo "root - $name"
echo "date - $date"
echo "whereami - $whereami"

echo "param1 - $1"
echo "param2 - $2"
echo "param3 - $3"


