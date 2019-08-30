#include <stdio.h>
#include <stdbool.h>

int main () {
    char rot[7] = {'I','O','S','H','Z','X','N'};
    char str[30];
    scanf("%s",str);
    int length;
    for(length = 0; str[length] != '\0'; ++length);
    int i;
    int j;
    bool isRot;
    for(i = 0; i < length; i++){
        isRot = false;
        for(j = 0; j < 7; j++){
            if(str[i]==rot[j]){
                isRot = true;
            }
        }
        if (isRot == false){
            printf("NO");
            return 0;
        }
    }
    printf("YES");
    return 0;
}
