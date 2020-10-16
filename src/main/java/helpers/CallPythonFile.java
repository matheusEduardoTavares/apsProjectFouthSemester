package helpers;

import customPanes.Error;

public class CallPythonFile {
    public CallPythonFile(String path, String command) {
        try {
            callPythonFile(path, command);
        } catch (Exception ex) {
            new Error("Erro ao chamar o arquivo python", "Erro");
        }
    }
    
    private void callPythonFile(String path, String command) throws Exception {
        String system = System.getProperty("os.name");
        String terminal = "", directory = "", finalCommand = "";
        if (system.toLowerCase().equals("linux")) {
            terminal = "/bin/bash";
            directory = "-c";
        }
        else {
            terminal = "cmd.exe";
            directory = "/c";
        }
        finalCommand = "cd \"" + path + "\" && " + command;
        ProcessBuilder builder = new ProcessBuilder(terminal, directory, finalCommand);
        builder.redirectErrorStream(true);
        Process p = builder.start();
    }
}
