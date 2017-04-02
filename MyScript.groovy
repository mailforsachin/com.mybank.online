freeStyleJob('Automatic FSJ') {
    
    scm {
        git('https://github.com/mailforsachin/com.mybank.online.git', 'development')
    }
  
    steps {
        steps {
        shell('python MyScript.py')
    }
    }
   
}
