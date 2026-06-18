class Solution {
public:
    int numIslands(vector<vector<char>>& grid) {
        int n = grid.size();
        int m = grid[0].size();
        vector<vector<int>> vis(n , vector<int>(m,0));
        queue<pair<int,int>> q;
        int ans =0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='0')
                {
                    vis[i][j]=1;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==0)
                {
                   ans++;
                   q.push({i,j});
                   vis[i][j]=1;
                   while(!q.empty())
                   {
                    int a = q.front().first;
                    int b = q.front().second;
                    q.pop();

                    int dI[4] = {-1,1,0,0};
                    int dJ[4] = {0,0,-1,1};

                    for(int k=0;k<4;k++)
                    {
                        int nI = a+dI[k];
                        int nJ = b+dJ[k];

                        if(nI>=0 && nI<n && nJ>=0 && nJ<m && vis[nI][nJ]==0)
                        {
                            q.push({nI,nJ});
                            vis[nI][nJ] = 1;
                        }
                    }

                   }
                }
            }
        }
        return ans;
        
    }
};
