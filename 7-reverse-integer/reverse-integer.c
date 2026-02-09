int reverse(int x) {
    int rev= 0;

    while (x != 0) {
        int rem= x % 10;
        x /= 10;
        if (rev>INT_MAX/10||(rev==INT_MAX / 10 && rem>5)) {
            return 0; 
        }
        if (rev< INT_MIN / 10 || (rev== INT_MIN / 10 && rem<-6)) {
            return 0; 
        }

        rev=rev*10+rem;
    }

    return rev;
}