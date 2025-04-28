package advan;

import java.util.List;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MapData {
    int cellsWidth = 28;
    int cellsHeight = 20;
    public TypePlace[][] places = new TypePlace[cellsWidth][cellsHeight];
    public MapData()
    {
        for (int i = 0; i < cellsWidth; i++) for (int j = 0; j < cellsHeight; j++)
            places[i][j] = TypePlace.nothing;
    }
    public void resetMap(String pathMap)
    {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(MainWindow.class.getResource(pathMap).toURI()));
        } catch (IOException | URISyntaxException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        String[][] words = new String[cellsWidth][cellsHeight];
        int x = 0;
        for (String line : lines)
        {
            var temp = line.split("\\|"); 
            for (int i = 0; i < cellsWidth; i++)
            {
                words[i][x] = temp[i];
            }
            x++;
        }
        for (int i = 0; i < cellsWidth; i++)
        {
            for (int j = 0; j < cellsHeight; j++)
            {
                
                if (words[i][j].equals("n")) places[i][j] = TypePlace.nothing;
                else if (words[i][j].equals("b")) places[i][j] = TypePlace.block;
                else 
                {
                    System.out.print(words[i][j] + " ");
                    places[i][j] = TypePlace.error;
                    
                }   
            }
        }
    }
}
enum TypePlace
{
    nothing, block, error
}
