//
//  ViewController.h
//  玩轉故事版
//
//  Created by 林宥辰 on 2017/3/23.
//  Copyright © 2017年 林宥辰. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface ViewController : UIViewController

@property (nonatomic, readonly) NSString *identifier;
@property (nonatomic, readonly) id sourceViewController;
@property (nonatomic, readonly) id destinationViewController;

@end

