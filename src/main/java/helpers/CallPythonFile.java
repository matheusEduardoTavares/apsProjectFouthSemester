package helpers;

import customPanes.Error;

public class CallPythonFile {
    public CallPythonFile(String path, String command, String partition) {
        try {
            callPythonFile(path, command, partition);
        } catch (Exception ex) {
            new Error("Erro ao chamar o arquivo python", "Erro");
        }
    }
    
    private void callPythonFile(String path, String command, String partition) throws Exception {
        String system = System.getProperty("os.name");
        String terminal = "", directory = "", finalCommand = "";
        if (system.toLowerCase().equals("linux")) {
            terminal = "/bin/bash";
            directory = "-c";
            finalCommand = "cd \"" + path + "\" && " + command;
        }
        else {
            terminal = "cmd.exe";
            directory = "/c";
            finalCommand = partition + ": \"" + path + "\" && " + command;
        }      
        ProcessBuilder builder = new ProcessBuilder(terminal, directory, finalCommand);
        builder.redirectErrorStream(true);
        Process p = builder.start();
    }
}
