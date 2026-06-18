class Solution {
public:
    void islandsAndTreasure(vector<vector<int>>& grid) {
     int n =grid.size();
     int m = grid[0].size();
     vector<vector<int>> vis(n, vector<int>(m,0));
     queue<pair<pair<int,int>,int>>q;
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<m;j++)
        {
           if(grid[i][j]==-1)
           {
            vis[i][j]=1;
           }else if(grid[i][j]==0)
           {
              vis[i][j]=1;
              q.push({{i,j},0});
           }
        }
     }
    

    while(!q.empty())
    {
        int i= q.front().first.first;
        int j = q.front().first.second;
        int d = q.front().second;
        q.pop();
        if(grid[i][j]==INT_MAX)
        {
            grid[i][j]=d;
        }
        int dI[4] = {-1,1,0,0};
        int dJ[4] = {0,0,-1,1};
        for(int k =0;k<4;k++)
        {
            int newI = i+dI[k];
            int newJ = j+dJ[k];

            if(newI>=0 && newI<n && newJ>=0 && newJ<m && vis[newI][newJ]==0)
            {
                q.push({{newI,newJ},d+1});
                vis[newI][newJ]=1;
            }
        }
    }
    }
};
