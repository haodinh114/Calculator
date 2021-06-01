//package Controller;
//
//import java.awt.*;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseMotionListener;
//
//public class CalMouseListener {
//    public class DrawingMouseListener implements MouseListener, MouseMotionListener {
//        //instance viariabes
//        private DrawingBoard screen;
//        private Controller controller;
//        private Circle board;
//        private int CorX, CorY; // the coordinate of the click
//        private Point startPoint; //starting point of mouse when dragging
//        private Point endPoint; //ending point of mouse when finish dragging
//
//        //Constructor for objects of class DrawingBoard and Controller
//
//        public DrawingMouseListener(DrawingBoard screen, Controller controller) {
//            super();
//            this.screen = screen;
//            this.controller = controller;
//            this.board = board;
//            startPoint = null;
//            endPoint = null;
//        }
//
//        @Override
//        public void mousePressed(MouseEvent e) {
//        }
//
//        @Override
//        public void mouseEntered(MouseEvent e) {
//        }
//
//        @Override
//        public void mouseExited(MouseEvent e) {
//        }
//
//        @Override
//        public void mouseMoved(MouseEvent e) {
//        }
//
//        //the motion happens when clicking the mouse
//        //@param e
//        @Override
//        public void mouseClicked(MouseEvent e) {
//            startPoint = e.getPoint();
//            endPoint = startPoint;
//            this.CorX = e.getX();
//            this.CorY = e.getY();
//
//            if (controller.getCurrentAction() == null) {
//                screen.testPoint((int) startPoint.getX(), (int) startPoint.getY());
//            }//shape
//            else if (controller.getCurrentAction().equals("Circle")) {
//                startPoint.setLocation(startPoint.getX(), startPoint.getY());
//                screen.addShape(new Circle(CorX, CorY, controller.getCurrentSize(), controller.getCurrentColor()));
//                controller.setCurrentAction(null);
//                controller.setCurrentSize(40);
//            } else if (controller.getCurrentAction().equals("Arrow")) {
//                startPoint.setLocation(startPoint.getX(), startPoint.getY());
//                screen.addShape(new Arrow(CorX, CorY, controller.getCurrentSize(), controller.getCurrentSize(), controller.getCurrentColor()));
//                controller.setCurrentAction(null);
//                controller.setCurrentSize(40);
//            } else if (controller.getCurrentAction().equals("Diamond")) {
//                startPoint.setLocation(startPoint.getX(), startPoint.getY());
//                screen.addShape(new Diamond(CorX, CorY, controller.getCurrentSize(), controller.getCurrentSize(), controller.getCurrentColor()));
//                controller.setCurrentAction(null);
//                controller.setCurrentSize(40);
//            } else if (controller.getCurrentAction().equals("Select")) {
//                screen.testPoint(e.getX(), e.getY());
//            }
//
//            //color
//            if (controller.getCurrentColor() != null) {
//                screen.selectedShape().setColor(controller.getCurrentColor());
//                controller.setCurrentColor(null);
//            }
//
//        }
//    }
//}
