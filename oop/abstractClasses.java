package oop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class abstractClasses{
public abstract class BaseFileReader{
    protected Path filePath;

    protected BaseFileReader(Path filePath){
        this.filePath = filePath;
    }

    public Path gePath(){
        return this.filePath;
    }

    public List<String> readFile() throws IOException{
        return Files.lines(filePath)
        .map(this::mapFileLine).collect(Collectors.toList());
    }

    protected abstract String mapFileLine(String line);

}

public class LowercaseFileReader extends BaseFileReader{
    public LowercaseFileReader(Path filePath){
        super(filePath);
    }
    
    @Override
    public String mapFileLine(String line){
        return line.toLowerCase();
    }
}
}
