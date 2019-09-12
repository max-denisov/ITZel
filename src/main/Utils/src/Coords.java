public class Coords {

    private int x;
    private int y;

    public void setX (int x)
    {
        if (x < 0 && x > 20)
        {
            System.out.println("Error");
        }
        else
        {
            this.x = x;
        }
    }

    public void setY (int y)
    {
        if (y < 0 && y > 20)
        {
            System.out.println("Error");
        }
        else
        {
            this.y = y;
        }
    }

    public void move(Utils.face face)
    {
        switch (face)
        {
            case UP:
            {
                setY(this.y + 1);
            }
            case DOWN:
            {
                setY(this.y - 1);
            }
            case LEFT:
            {
                setX(this.x - 1);
            }
            case RIGHT:
            {
                setX(this.x + 1);
            }
            default: System.out.println("Error");
        }
    }
}
