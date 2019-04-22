for i in *.java; do
    sed -i 's/.*package simplest;.*/package org.sergei.simplest;/' $i
done