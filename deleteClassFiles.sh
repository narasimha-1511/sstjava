#!/bin/bash
#

#find "/home/narasimha/Documents/Java" -maxdepth 1 -name '*.class' -exec rm -r {}
rm -r $(find "/home/narasimha/Documents/Java" -name '*.class')
echo "Files Deleted Succesfully"
