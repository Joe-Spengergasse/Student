public class Student   
{
    private String name;
    private int alter;
    private boolean matura;
    private String habmichlieb;

    public Student(String neuName, int neuAlter, boolean neuMatura)
    {
        setName(neuName);
        setAlter(neuAlter);
        setMatura(neuMatura);
    }

    public Student()
    {
        setName("UNKN");
        setAlter(14);
        setMatura(false);
        sethabmichlieb("dhdhd");
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAlter(int alter)
    {
        this.alter = alter;
    }

    public void setMatura(boolean matura)
    {
        this.matura = matura;
    }

    public void sethabmichlieb(String habmichlieb)
    {
        this.habmichlieb = habmichlieb;
    }

    public String getName()
    {
        return name;
    }

    public int getAlter()
    {
        return alter;
    }

    public boolean getMatura()
    {
        return matura;
    }

    public String sethabmichlieb()
    {
        return habmichlieb;
    }

    public void printStudent()
    {
        System.out.println("Student:\t" + name + "\t" + alter + "\t" + matura);
    }
}
