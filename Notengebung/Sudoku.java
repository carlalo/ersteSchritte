import java.util.List;
import java.util.ArrayList;
public class Sudoku
{
    List<String> strings = new ArrayList<>();
    public Sudoku()
    {strings.add("5");
        strings.add("3");
        strings.add(".");
        strings.add(".");
        strings.add("7");
        strings.add(".");
        strings.add(".");
        strings.add(".");
        strings.add(".");
        strings.add("6");
        strings.add(".");
        strings.add(".");
        strings.add("1");
        strings.add("9");
        strings.add("5");
        strings.add(".");
        strings.add(".");
        strings.add(".");
        strings.add(".");
        strings.add("9");
        strings.add("8");
        strings.add(".");
        strings.add(".");
        strings.add(".");
        strings.add(".");
        strings.add("6");
        strings.add(".");
        strings.add("8");
        strings.add(".");
        strings.add(".");
        strings.add(".");
        strings.add("6");
        strings.add(".");
        strings.add(".");
        strings.add(".");
        strings.add("3");
        strings.add("4");
        strings.add(".");
        strings.add(".");
        strings.add("8");
        strings.add(".");
        strings.add("3");
        strings.add(".");
        strings.add(".");
        strings.add("1");
        strings.add("7");
        strings.add(".");
        strings.add(".");
        strings.add(".");
        strings.add("2");
        strings.add(".");
        strings.add(".");
        strings.add(".");
        strings.add("6");
        strings.add(".");
        strings.add("6");
        strings.add(".");
        strings.add(".");
        strings.add(".");
        strings.add(".");
        strings.add("2");
        strings.add("8");
        strings.add(".");
        strings.add(".");
        strings.add(".");
        strings.add(".");
        strings.add("4");
        strings.add("1");
        strings.add("9");
        strings.add(".");
        strings.add(".");
        strings.add("5");
        strings.add(".");
        strings.add(".");
        strings.add(".");
        strings.add(".");
        strings.add("8");
        strings.add(".");
        strings.add(".");
        strings.add("7");
        strings.add("9");
    }

    @Override
    public String toString()
    {   
        StringBuilder string = new StringBuilder();
        for (int row=0; row < 9; ++row) {
            for (int column=0; column < 9; ++column) {
                int index = row * 9 + column;
                string.append(strings.get(index));
                if (column == 2 || column == 5) {
                    string.append("|");
                }
            }
            string.append("\n");

            if (row == 2 || row == 5) {
                string.append("---+---+---\n");
            }
        }

        return string.toString();
    }

    public boolean isEmpty()
    {boolean isEmpty=false;
        return isEmpty;
    }

    public boolean isValid()
    {boolean isValid=false;
        return isValid;
    }

    public boolean isSolved()
    {boolean isSolved=false;
        return isSolved;
    }
    /* List<String> strings = new ArrayList<>();
    strings.add("hi");
    strings.remove("hi");

    return strings.get(0);
     */
}