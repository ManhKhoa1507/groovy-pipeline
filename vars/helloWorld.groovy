def call () {
    def workSpace = env.WORKSPACE
    def filePath = "${workSpace}/scripts/helloWorld.sh"
    echo workSpace

    def helloWorldScripts = readFile(filePath)
    echo helloWorldScripts
}

def readFile(String filePath) {
    File file = new File(filePath)
    String fileContent = file.text
    return fileContent
}