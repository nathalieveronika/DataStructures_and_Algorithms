public class Sorter {
  public Contact[] list;

  //++ SELECTION SORT - QUESTION 2++//
  public void selectionSort(Contact[] list, int n)
  {
    for (int i = 0; i < n; i++)
    {
      int minIndex = i;
      for (int j = i+1; j < n; j++)
      {
        if (list[j].compareTo(list[minIndex]) < 0)
        minIndex = j;
      }
      swap(list, i, minIndex);
    }
  }

  private void swap(Contact[] list, int a, int b){
    Contact temp = list[a];
    list[a] = list[b];
    list[b] = temp;
  }

  //++ PRINT FUNCTION ++//
  public String print(Contact[] list){
    int n = list.length;
    String t = "";
    for ( int i = 0; i < n; i++) {
      t = t + list[i].toString() + " / ";
    }
    return t;
  }

  //++ INSERTION SORT - QUESTION 3++//
  void insertionSort(Contact[] a)
  {
    for(int s = 2; s <= a.length; s++)
    {
      Contact sortMe = a[ s - 1 ];
      int i = s - 2;
      while (i >= 0 && sortMe.compareTo(a[i]) < 0)
      {
        a[i+1] = a[i];
        i--;
      }
      a[i+1] = sortMe;
    }
  }

  //++ QUICKSORT - QUESTION 4++//
  void quickSort(Contact[] array, int first, int last)
  {
    // if (array[last].compareTo(array[first]) > 0)
    if (last - first >= 1)
    {
      int pivotIndex;
      pivotIndex = partition(array,first,last);
      quickSort(array,first,pivotIndex-1); // left
      quickSort(array,pivotIndex+1,last); // right
    }
  }

  int partition(Contact a[], int low, int high)
  {
    int pi = low;
    Contact pivot = a[low];
    do
    {
      while ( low <= high && a[low].compareTo(pivot) <= 0 )
      low++;
      while ( a[high].compareTo(pivot) > 0 )
      high--;
      if ( low < high )
      swap(a, low, high);
    }
    while ( low < high );
    swap(a, pi, high);
    pi = high;
    return pi;
  }

  //++ MERGESORT - QUESTION 5++//

  public void mergeSort(Contact[] array, int left, int right){
      if( left < right){
        int middle = (right - left)/2;
        mergeSort(array, left, middle);
        mergeSort(array, middle + 1, right);
        merge(array, left, middle, right);
      }
  }
  private void merge(Contact[] a, int low, int middle, int high) {
    Contact[] temp = new Contact[high+1]; // put in class
    for (int i = low; i <= high; i++){
      temp[i] = a[i];
    }
    int i = low;
    int j = middle + 1;
    int k = low;
    while (i <= middle && j <= high) {
      if (temp[i].compareTo(temp[j]) <= 0 ) {
        a[k] = temp[i];
        i++;
      } else {
        a[k] = temp[j];
        j++;
      }
      k++;
    }
    while (i <= middle) {
      a[k] = temp[i];
      k++; i++;
    }
  }


}
