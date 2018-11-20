// My first C# code, and most probably the last. Why does this language even exist? But I am #NotAHater

using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;

class Solution {

    static string[] cavityMap(string[] grid)
{
    for (int i = 1; i < grid.Length - 1; i++)
    {
        for (int j = 1; j < grid[i].Length - 1; j++)
        {
            int middleUpper = (int)char.GetNumericValue(grid[i - 1][j]);
            int left = (int)char.GetNumericValue(grid[i][j - 1]);
            int right = (int)char.GetNumericValue(grid[i][j + 1]);
            int middleUnder = (int)char.GetNumericValue(grid[i + 1][j]);

            var adjacent = new int[4]
            {
                        middleUpper,
                left,                   right,
                        middleUnder
            };

            if (adjacent.Any(a => a < 0)) 
                continue;


            int ij = (int)char.GetNumericValue(grid[i][j]);

            if (adjacent.All(a => a < ij))
                grid[i] = grid[i].Remove(j, 1).Insert(j, "X");

        }
    }

    return grid;
}

    static void Main(string[] args) {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        int n = Convert.ToInt32(Console.ReadLine());

        string[] grid = new string [n];

        for (int i = 0; i < n; i++) {
            string gridItem = Console.ReadLine();
            grid[i] = gridItem;
        }

        string[] result = cavityMap(grid);

        textWriter.WriteLine(string.Join("\n", result));

        textWriter.Flush();
        textWriter.Close();
    }
}
