def call(String url, String branch){
  echo "This is clong the code"
  git url: "${url}", branch: "${branch}"
  echo "Clone Cloning Successful"
}
