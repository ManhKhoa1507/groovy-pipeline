import java.util.logging.Logger

def logInfo(String message) {
    Logger logger = Logger.getLogger('logs')
    logger.log(Level.INFO, message)
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
        logInfo('Reading ${filePath}')
        String fileContent = file.text
        return fileContent
    } else {
        logger.error('File not exists')
        return null
    }
}
