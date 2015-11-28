/**
 * Created by aviad on 28/11/2015.
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BirthDate
{

SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
private Calendar _birthDate = Calendar.getInstance();

public BirthDate(int day, int month, int year)
	{
		if (year > 999) _birthDate.set(year, month - 1, day);

		else if (year < 100) _birthDate.set(1900 + year, month - 1, day);

		if (month > 12 || month < 1 || day > 31 || day < 1)
			{
			throw new IllegalArgumentException("Invalid Date! Check dates");

			}
	}

public boolean hasBirthdayThisMonth()
	{

		return _birthDate.get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH);
	}

@Override
public String toString()
	{
		return sdf.format(_birthDate.getTime());
	}
}
