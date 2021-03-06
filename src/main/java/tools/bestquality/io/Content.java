package tools.bestquality.io;

import javax.inject.Singleton;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;

import static java.nio.file.Files.newBufferedWriter;
import static java.nio.file.Files.readAllBytes;

@Singleton
public class Content {

    public String read(Path path, Charset charset)
            throws IOException {
        return new String(readAllBytes(path), charset);
    }

    public void write(Path path, Charset charset, String content)
            throws IOException {
        try (BufferedWriter writer = newBufferedWriter(path, charset)) {
            writer.append(content);
        }
    }
}
