pipeline   {
    agent   any

    stages  {
        stage('ok') {
            steps {
                echo "ok"
            }
        post {
         mail bcc: 'manojk.gollaprolu@gmail.com', body: '''Build is over
 Thanks,
 Manoj,''', cc: 'manojk.gollaprolu@gmail.com', from: 'manojgollaprolu@gmail.com', subject: 'Build is over!!', to: 'manojk.gollaprolu@gmail.com'
        }    
        }
    }
}