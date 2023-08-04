//moving Zeros To The End Of The Array
class Array
{
  public static void main (String args[])
  {
    int nums[] = new int[]{ 12, 0, 9, 0, 34, 97, 02 };
    int size = nums.length;
    int nz = 0, z = 0;
    while (nz < size)
      {
	if (nums[nz] != 0)
	  {
	    int temp = nums[nz];
	      nums[nz] = nums[z];
	      nums[z] = temp;
	      nz++;
	      z++;
	  }
	else
	  {
	    nz++;
	  }
      }
    for (z = 0; z < size; z++)
      {
	System.out.println (nums[z]);
      }
  }
}
