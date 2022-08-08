import groovy.util.logging.Log
final Logger logger = LoggerFactory.getLogger("myGroovyLogger");

def call () {
    def workSpace = env.WORKSPACE
    def filePath = "${workSpace}/scripts/helloWorld.sh"

    def helloWorldScripts = readFile(filePath)
    sh "${helloWorldScripts}"
}

def readFile(String filePath) {
    File file = new File(filePath)

    if (file.exists()) {
        logger.info("Reading file ${filePaht}")
        String fileContent = file.text


        return fileContent

    } else {
        logger.error('File not exists')
        return null
    }
}
