import java.util.*;

// An activity has a start time, and finish time.
class Activity
{
	int start, finish;

// Activity Constructor
public Activity(int start, int finish)
	{
		this.start = start;
		this.finish = finish;
	}
}

class Compare
{
	// Sorting activities by finish time
	static void compare(Activity arr[], int n)
	{
		Arrays.sort(arr, new Comparator<Activity>()
		{
			@Override
			public int compare(Activity s1, Activity s2)
			{
				return s1.finish - s2.finish;
			}
		});
	}
}

class ActivitySelection
{
	static void activitySelection(Activity arr[], int n)
	{
		// calling sorting function
		Compare obj = new Compare();
		obj.compare(arr, n);
		System.out.print("Selected Activities are : ");

		// The first activity will be always selected
		int i = 0;
		System.out.print("(" + arr[i].start + ", "+ arr[i].finish + ") ");

		// Traversing remaining activities
		for (int j = 1; j < n; j++)
		{

		// If current activity has start time >= finish time of previously selected activity
		if (arr[j].start >= arr[i].finish)
		{
			System.out.print("(" + arr[j].start + ", "+ arr[j].finish + ") ");
			i = j;
		}
	}
}

public static void main(String[] args)
{

	int n = 7;
	Activity arr[] = new Activity[n];
	arr[0] = new Activity(3, 4);
	arr[1] = new Activity(2, 5);
	arr[2] = new Activity(1, 3);
	arr[3] = new Activity(5, 9);
	arr[4] = new Activity(0, 7);
	arr[5] = new Activity(11, 12);
	arr[6] = new Activity(8, 10);

	activitySelection(arr, n);
}
}
