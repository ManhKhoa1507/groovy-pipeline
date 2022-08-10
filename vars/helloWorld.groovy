import java.util.logging.Logger
import java.util.logging.Level

def call () {
    // Get current workspace
    String workSpace = env.WORKSPACE
    // String workSpace = '.'
    String filePath = "${workSpace}/scripts/helloWorld.sh"

    def helloWorldScripts = readFile(filePath)

    writeFile file: 'ahihi.txt', text: "ahihi"
    sh "${helloWorldScripts}"
}

def readFile(String filePath) {
    File file = new File(filePath)

    if (file.exists()) {
        logInfo('Reading scripts file')
        String fileContent = file.text
        return fileContent
    } else {
        logError('File not exists')
    }
}

void logMessage(String prelix, String message) { 
    println prelix + " " + message
}

void logInfo(String message) {
    logMessage('[INFO]' , message)
}

void logError(String message) {
    // logMessage('[ERROR]', message) 
    throw new Exception (message)
}

call()
