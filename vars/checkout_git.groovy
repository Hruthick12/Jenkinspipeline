def checkout_git(string repo){

    echo "this is for checking out git code."
            git credentialsId: 'github', url:'git@github.com:Hruthick12/${repo}.git'

}
return this