def call(String GitUrl, String GitBranch){
  echo "Cloning code from GitHub repository: ${GitUrl}"
  git url: GitUrl, branch:GitBranch
  echo "Code clone successful
}
