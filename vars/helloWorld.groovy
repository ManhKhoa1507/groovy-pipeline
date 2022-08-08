import java.util.logging.Logger

Logger logger = Logger.getLogger("")

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
        logger.info("Reading file ${filePaht}")
        return fileContent
    } else {
        logger.error("File not exists")
    }

}