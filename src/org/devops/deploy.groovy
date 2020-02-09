package org.devops

//ansible
def AnsibleDeploy(hosts,func){
    sh "sudo ansible ${func} ${hosts}"
}