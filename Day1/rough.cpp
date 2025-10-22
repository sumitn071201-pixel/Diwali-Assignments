#include<iostream>

#include<vector>

#include<algorithm>

int main()

{

         std::vector<int> numbers ={5,2,8,1,7};

        numbers.erase(std::remove(numbers.begin(),numbers.end(),numbers.front()),numbers.end());
        std::cout<<"Elements after removing first element: ";

        for(const auto &num : numbers)

        {

            std::cout<<num<<" ";

        }

        return 0;
}