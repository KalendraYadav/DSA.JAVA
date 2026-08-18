#include<stdio.h>
int main(){
    int arr1[]={2,3,1,3,2,4,6,7,9,2,19};
    int arr2[]={2,1,4,3,9,6};
    int n1=11;
    int n2=6;
    int ans[n1];
    int index=0;
    for(int i=0;i<n2;i++){
        for(int j=0;j<n1;j++){
            if(arr1[j]==arr2[i]){
                ans[index]=arr1[j];
                index++;
            }
        }
    }

    //puting the leftover element
    for(int i=0;i<n1;i++){
        int found =0;
        for(int j=0;j<n2;j++){
            if(arr1[i]==arr2[j]){
                found=1;
                break;
            }
        }
        if(found==0){
            ans[index]=arr1[i];
            index++;
        }
    }

    for(int i=0;i<index;i++){
        printf("%d ",ans[i]);
    }
    }