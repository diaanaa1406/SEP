public class DateInterval
{
  private MyDate startDate;
  private MyDate endDate;
  public DateInterval(MyDate startDate,MyDate endDate)
  {
    this.startDate=startDate;
    this.endDate=endDate;
  }
  public void setStartDate(MyDate startDate)
  {
    this.startDate=startDate;
  }
  public void setEndDate(MyDate endDate)
  {
    this.endDate=endDate;
  }

  public MyDate getEndDate()
  {
    return endDate;
  }

  public MyDate getStartDate()
  {
    return startDate;
  }
}
