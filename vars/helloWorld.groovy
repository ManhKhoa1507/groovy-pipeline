import org.identityconnectors.common.logging.Log
def log = log as Log

def call () {
    def workSpace = env.WORKSPACE
    def filePath = "${workSpace}/scripts/helloWorld.sh"

    def helloWorldScripts = readFile(filePath)
    sh "${helloWorldScripts}"
}

def readFile(String filePath) {
    File file = new File(filePath)

    if (file.exists()) {
        String fileContent = file.text
        log.info("Reading file ${filePaht}")
        return fileContent

    } else {
        log.error('File not exists')
    }
}
