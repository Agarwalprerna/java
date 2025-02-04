#include<stdio.h>
#include<string.h>
int main(){
/*
int arr1[5],arr2[5],arr3[5] ,i;
	int N=5;
	printf("entr the elements of array 1: ");
	for(i=0;i<N ;i++){
		scanf("%d" , &arr1[i]);
	}
	printf("enter the elements of array 2");
	for(i=0 ;i<N;i++){
		scanf("%d",&arr2[i]);
	}
	
	for(i=0;i<N;i++){
		arr3[i]= arr1[i] *arr2[i];
	printf("third array is arr3[%d] = %d\n" ,i,arr3[i]);
}
	return 0;
}
*/

///////////////////sorting the array

/*int arr[6]= {3 ,4,9,0,1,5};
int i,j,temp;

printf("unsorted array ");
for(i=0;i<6;i++){
	printf("\narr[%d]=%d ",i,arr[i]);
}

printf("\nsorted array");
for(i=0;i<6;i++){
	for(j=i+1 ;j<6 ;j++){
		if (arr[i]<arr[j]){
			temp = arr[i];
			arr[i]=arr[j];
			arr[j] = temp;
		}
	}
}

printf("\n");
for(i=0;i<6;i++){
	printf("\narr[%d]= %d",i,arr[i]);
}
return 0;
}

*/

//////////////////////////designaed arra
/*
int arr[]= {3 ,4,1 , [4]= 9, 8 ,10 ,[7] =90};
printf("the array is ");

int size = sizeof(arr)/sizeof(arr[0]);
printf("%d",size);
return 0;
}

*/

///////////////////////////////////////  deleting the element in array

/*
int i,position;
int arr[6]= {4 ,7,2,1,0,8};
for(i=0;i<6;i++){
	printf("\n arr[%d] = %d ",i,arr[i]);
}
printf("\nenter the element position to be deleted");
scanf("%d",&position);

for(i=position;i<6-1;i++){
	arr[i] = arr[i+1];
}
printf("resultant array");
for(i=0;i<6;i++){
	printf("\narr[%d]= %d",i,arr[i]);
}
return 0;
}
*/


//////////////////////////////////////// substracting 2 D array

/*
int arr1[3][2] = {{2,5},{7,0},{1,10}};
int arr2[3][2]= {{4,4},{9,0},{11,8}};
int i,j, arr3[3][2];
printf(" 3x2 matrix A =\n ");
for(i=0;i<3;i++){
	for(j=0;j<2;j++){
		printf(" %d",arr1[i][j]);
	}
	printf("\n");
}

printf(" 3x2 matrix B =\n ");
for(i=0;i<3;i++){
	for(j=0;j<2;j++){
		printf(" %d",arr2[i][j]);
	}
	printf("\n");
}

printf("substracting both matrices\n");
for(i=0;i<3;i++){
	for(j=0;j<2;j++){
		arr3[i][j]= arr1[i][j] - arr2[i][j];
		printf(" %d",arr3[i][j]);
	}
	printf("\n");
}
return 0;
}

*///


/////////////////////////////////////////////////////////////////  strings 
///string is an arrray of charachters 

/*
char str[50];
printf("enter your full name : ");
gets(str);
printf("user name is %s",str);
puts(str);

printf("size of string or array is  %d\n",sizeof(str));
printf("length of the string of user name %d\n",strlen(str));

return 0;
}
*/


////////////////////////////// string comparision 
/*
char name1[20], name2[20];
printf("enter the strings ");
gets(name1);
gets(name2);
int value = strcmp(name1 ,name2);

if(value ==0){
	printf("strings are equal");
}
else{
	printf("strings are not equal");
}
return 0;
}
*/

////////////////////////////////// counting the frequency of occurance of charachter in string
char name[20] , x;
int i,count =0;

printf("enter the string: ");
gets(name);

printf("enter hte charchter to be searched: ");
x = getchar();

for(i=0; name[i];i++){
	if(name[i]== x){
		count++;
	}
}
printf("charachter %c occurs %d times\n",x,count);
return 0;
}

































