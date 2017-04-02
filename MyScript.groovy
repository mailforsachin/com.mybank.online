freeStyleJob('example') {
    
    scm {
        git('https://github.com/mailforsachin/com.mybank.online.git', 'master')
    }
  
    steps {
        steps {
        shell('python MyScript.py')
    }
    }
   
}
