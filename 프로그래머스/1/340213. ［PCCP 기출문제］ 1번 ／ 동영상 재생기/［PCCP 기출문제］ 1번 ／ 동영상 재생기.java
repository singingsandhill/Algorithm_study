import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLength = timeToSeconds(video_len);
        int currentPosition = timeToSeconds(pos);
        int openingStart = timeToSeconds(op_start);
        int openingEnd = timeToSeconds(op_end);

        // 오프닝 구간에 있으면 자동으로 op_end로 이동
        if (currentPosition >= openingStart && currentPosition <= openingEnd) {
            currentPosition = openingEnd;
        }

        // 명령어 수행
        for (String command : commands) {
            if (command.equals("prev")) {
                currentPosition = Math.max(currentPosition - 10, 0); // 10초 전으로 이동
            } else if (command.equals("next")) {
                currentPosition = Math.min(currentPosition + 10, videoLength); // 10초 후로 이동
            }

            // 명령 수행 후 오프닝 구간에 있으면 자동으로 op_end로 이동
            if (currentPosition >= openingStart && currentPosition <= openingEnd) {
                currentPosition = openingEnd;
            }
        }

        return secondsToTime(currentPosition);
    }

    // "mm:ss" 형식을 초 단위로 변환
    private static int timeToSeconds(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }

    // 초 단위를 "mm:ss" 형식으로 변환
    private static String secondsToTime(int seconds) {
        int minutes = seconds / 60;
        seconds = seconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
    }