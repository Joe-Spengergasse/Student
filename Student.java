public class Student   
{
    private String name;
    private int alter;
    private boolean matura;
    
    public Student(String neuName, int neuAlter, boolean neuMatura)
    {
        setName(neuName);
        setAlter(neuAlter);
        setMatura(neuMatura);
    }
    
    public Student()
    {
        setName(name);
        setAlter(alter);
        setMatura(matura);
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

    public void printStudent()
    {
        System.out.println("Student:\t" + name + "\t" + alter + "\t" + matura);
    }
}
