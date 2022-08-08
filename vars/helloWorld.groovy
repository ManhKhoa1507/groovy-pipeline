def call () {
    def filePath = "./scripts/helloWorld.sh"
    def helloWorldScripts = readFile(filePath)
    echo helloWorldScripts
}

def readFile(String filePath) {
    File file = new File(filePath)
    String fileContent = file.text
    return fileContent
}