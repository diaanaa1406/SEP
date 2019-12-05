import java.util.ArrayList;
import java.util.InputMismatchException;

public class Classroom
{
  private String number;
  private int numberOfSeats;
  private boolean projector;
  private int numberOfSockets;
  private ArrayList<ExternalPort> externalPorts;
  public Classroom(String number, int numberOfSeats, boolean projector, int numberOfSockets)
  {
    try
    {
      this.number=number;

    }catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }
    try
    {
      this.numberOfSeats=numberOfSeats;

    }catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }
    try
    {
      this.projector=projector;

    }catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }
    try
    {
      this.numberOfSockets=numberOfSockets;

    }catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }
    externalPorts=new ArrayList<>();
  }

  public void setNumber(String number)
  {
    try
    {
      this.number=number;

    }catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }
  }

  public void setNumberOfSeats(int numberOfSeats)
  {
    try
    {
      this.numberOfSeats=numberOfSeats;

    }catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }
  }

  public void setProjector(boolean projector)
  {
    try
    {
      this.projector=projector;

    }catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }
  }

  public void setNumberOfSockets(int numberOfSockets)
  {
    try
    {
      this.numberOfSockets=numberOfSockets;

    }catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }
  }

  public String getNumber()
  {
    return number;
  }
  public boolean getProjector()
  {
    return projector;
  }

  public int getNumberOfSeats()
  {
    return numberOfSeats;
  }

  public int getNumberOfSockets()
  {
    return numberOfSockets;
  }

  public ArrayList<ExternalPort> getExternalPorts()
  {
    return externalPorts;
  }
}
