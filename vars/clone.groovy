def call(String url, String branch) {
    echo "Dynamically cloning the code from ${url} [branch: ${branch}]"
    
    git url: url, branch: branch
    
    echo "Code cloned successfully"
}
