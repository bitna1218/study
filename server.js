const express = require('express');
const http = require('http');
const socketIO = require('socket.io');

// Express 앱 생성
const app = express();

// 정적 파일들을 서빙
app.use(express.static(__dirname + '/'));

// HTTP 서버와 Socket.io 초기화
const server = http.createServer(app);
const io = socketIO(server);

// Socket.io 이벤트 핸들링
io.on('connection', (socket) => {
  console.log('새로운 클라이언트 연결:', socket.id);

  // 클라이언트에서 전달되는 offer, answer, ICE candidate 중계
  socket.on('offer', (data) => {
    console.log('offer 받음');
    socket.broadcast.emit('offer', data);
  });

  socket.on('answer', (data) => {
    console.log('answer 받음');
    socket.broadcast.emit('answer', data);
  });

  socket.on('ice-candidate', (data) => {
    console.log('ICE candidate 받음');
    socket.broadcast.emit('ice-candidate', data);
  });

  socket.on('disconnect', () => {
    console.log('클라이언트 연결 해제:', socket.id);
  });
});

// 서버 실행 (포트 3000)
server.listen(3000, () => {
  console.log('서버가 포트 3000에서 실행 중...');
});