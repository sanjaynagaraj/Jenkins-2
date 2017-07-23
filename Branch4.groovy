job('DSL-Tutorial-1-Test') {
   scm {
       git('https://github.com/sanjaynagaraj/mygit.git')
   }
   triggers {
       scm('H/15 * * * *')
   }
   steps {
       
      shell('echo Hello World!')
   }
} 
