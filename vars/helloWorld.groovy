import java.util.logging.Logger

void logInfo(String message) {
    Logger logger = Logger.getLogger("")
    logger.info(message)
}

def call () {
    def workSpace = env.WORKSPACE
    def filePath = "${workSpace}/scripts/helloWorld.sh"

    def helloWorldScripts = readFile(filePath)
    sh "${helloWorldScripts}"
}

def readFile(String filePath) {
    File file = new File(filePath)

    if (file.exists()) {
        logInfo('Reading file')
        String fileContent = file.text
        return fileContent
    } else {
        logger.error('File not exists')
        return null
    }
}
