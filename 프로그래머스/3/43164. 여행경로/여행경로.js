function solution(tickets) {
    let path = []; // 최종 경로를 저장할 배열
    let len = tickets.length;
    let visited = Array(len).fill(false); // 방문 여부를 기록하는 배열

    // tickets를 알파벳 순서로 정렬 (알파벳 순서로 앞서는 경로를 찾기 위함)
    tickets.sort((a, b) => a[1].localeCompare(b[1]));

    function DFS(currentAirport, route) {
        // 모든 티켓을 사용한 경우, 경로를 저장하고 리턴
        if (route.length === len + 1) {
            path = route;
            return true;
        }
        
        for (let i = 0; i < len; i++) {
            // 방문하지 않은 티켓 중 현재 공항에서 출발하는 티켓 찾기
            if (!visited[i] && tickets[i][0] === currentAirport) {
                visited[i] = true;
                if (DFS(tickets[i][1], [...route, tickets[i][1]])) return true; // 경로가 완성되면 즉시 리턴
                visited[i] = false;
            }
        }
        
        return false;
    }

    DFS("ICN", ["ICN"]);
    return path;
}