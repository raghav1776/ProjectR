package JAVA_Learner

import groovy.json.JsonSlurper

class JSONSlurper {

    static void main (String[] args){
        String text = '{"message":"hello world", "joe":"How are you doing?"}'
        JsonSlurper slurper = new JSONSlurper()
        Object result = slurper.parseText(text)
        println result.getClass()

    }
}
