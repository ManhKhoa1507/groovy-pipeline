import groovy.util.logging.Log

@Log
def call () {
    def workSpace = env.WORKSPACE
    def filePath = "${workSpace}/scripts/helloWorld.sh"

    def helloWorldScripts = readFile(filePath)
    sh "${helloWorldScripts}"
}

def readFile(String filePath) {
    File file = new File(filePath)

    if (file.exists()) {
        log.info("Reading file ${filePaht}")
        String fileContent = file.text


        return fileContent

    } else {
        log.error('File not exists')
        return null
    }
}
