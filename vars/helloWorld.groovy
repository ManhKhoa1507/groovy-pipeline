def call () {
    def helloWorldScripts = readFile("./scripts/helloWorld.sh")
    echo helloWorldScripts
}

def readFile(String filePath) {
    File file = new File(filePath)
    String fileContent = file.text
    return fileContent
}